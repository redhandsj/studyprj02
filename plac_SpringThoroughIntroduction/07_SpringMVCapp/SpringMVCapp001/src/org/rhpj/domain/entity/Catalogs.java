package org.rhpj.domain.entity;

public class Catalogs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CATALOGS.CATALOG_NAME
     *
     * @mbg.generated
     */
    private String catalogName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CATALOGS.CATALOG_NAME
     *
     * @return the value of CATALOGS.CATALOG_NAME
     *
     * @mbg.generated
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CATALOGS.CATALOG_NAME
     *
     * @param catalogName the value for CATALOGS.CATALOG_NAME
     *
     * @mbg.generated
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
}