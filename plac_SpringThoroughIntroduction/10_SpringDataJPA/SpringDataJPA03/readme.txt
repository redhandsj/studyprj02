★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 10) Spring Data JPA (P.493 - 536)
しおり　：　P.531
URL　:　 http://localhost:8080/SpringDataJPA03/web

★ 2016/12/30(金)に、JPAConfigの勉強の為にSpringDataJPA02から派生して作成



//==========================================================================================================
// 10.1 JPA （Java Persistence API）とは
//==========================================================================================================
★ ORM と JPA の概念
 - ORM（Object-Relational Mapping、Object-Relational Mapper）
   - 「リレーショナルデータベース（以下、データベースと略す）への読み書きを、オブジェクトへのアクセスにより
     透過的に実現する仕組み」

★ Entity
 - データベース上の永続化されたデータをマッピングするJavaオブジェクト


★ EntityManager
 - ※省略

★ Entityの状態
 - new : インスタンスのみでDBとは同期されていない
 - 管理 : DBへの同期中
 - 分離 : DBとは同期されていない
 - 削除済み : 削除が予定されている状態

★ 関連
　-　@OneToMany(mappedBy = "room", cascade = CascadeType.ALL) 

★ JPQL




//==========================================================================================================
// 10.2 JPAを用いたデータベースアクセスの基本
//==========================================================================================================



//==========================================================================================================
// 10.3 Spring Data JPA 
//==========================================================================================================



//==========================================================================================================
// 10.4 Spring Data JPAのアーキテクチャ
//==========================================================================================================




//==========================================================================================================
// 10.5 Spring Data JPAのセットアップ
//==========================================================================================================




//==========================================================================================================
// 10.6 Repositoryの作成と利用
//==========================================================================================================





//==========================================================================================================
// 問題
//==========================================================================================================

//==========================================================================================================
// 未整頓メモ
//==========================================================================================================

★ MavenでJPAのエンティティからDDLファイルをエクスポートする
https://blog.ik.am/entries/258


★ pom.xml
  <!-- create DDL処理 -->
  <build>
    <plugins>
      <plugin>
        <artifactId>maven-antrun-plugin</artifactId>
        <version>1.7</version>
        <executions>
          <execution>
            <!-- Hibernatetool will generate everything before running tests -->
            <phase>install</phase>
            <configuration>
              <target>
                <echo message="[gen-ddl] start!"/>
                <property name="maven_compile_classpath" refid="maven.compile.classpath"/>
                <property name="maven_test_classpath" refid="maven.test.classpath"/>
                <path id="hibernatetool.path">
                  <pathelement path="${maven_compile_classpath}"/>
                  <pathelement path="${maven_test_classpath}"/>
                </path>
                <taskdef name="hibernatetool"
                          classname="org.hibernate.tool.ant.HibernateToolTask"
                          classpathref="hibernatetool.path"/>
                <property name="ddl.generated.directory"
                           value="${project.build.directory}/generated-ddl"/>
                <mkdir dir="${ddl.generated.directory}"/>
                <!-- 作成 -->
                <hibernatetool destdir="${ddl.generated.directory}">
                  <classpath>
                    <path location="${project.build.directory}/classes"/>
                  </classpath>
                  <jpaconfiguration persistenceunit="gen-ddl"/>
                  <hbm2ddl export="false" outputfilename="generated-ddl.sql" format="true"/>
                </hibernatetool>
                <echo message="[gen-ddl] completed!"/>
              </target>
            </configuration>
            <goals>
              <goal>run</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>



★ persistence.xml
  <persistence-unit name="gen-ddl" transaction-type="RESOURCE_LOCAL">
    <properties>
    <!--<property name="hibernate.ejb.naming_strategy"-->
    <!--value="org.springframework.boot.orm.jpa.SpringNamingStrategy"></property>-->
      <property name="hibernate.ejb.naming_strategy" value="org.hibernate.cfg.ImprovedNamingStrategy"></property>
      <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5InnoDBDialect"></property>
    </properties>
  </persistence-unit>




//==========================================================================================================
// <END>
//==========================================================================================================
