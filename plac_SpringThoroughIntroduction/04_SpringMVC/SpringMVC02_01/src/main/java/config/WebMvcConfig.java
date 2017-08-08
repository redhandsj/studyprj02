package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// DispatcherServlet�p�̃R���t�B�M�����[�V�����N���X���쐬
@Configuration
// Spring MVC���񋟂��Ă���R���t�B�M�����[ �V�����N���X���C���|�[�g����ASpring MVC�𗘗p���邽�߂ɕK�v�ƂȂ�R���|�[�l���g��Bean��`�������ōs �Ȃ��� 
@EnableWebMvc
// �w�肵���p�b�P�[�W�̔z���� ����X�e���I�^�C�v�A�m�e�[�V�����i@Component��@Controller�Ȃǁj���t�^����Ă���N���X���X�L��������A �A�v���P�[�V�����R���e�L�X�g��Bean�o�^�����
@ComponentScan("app")
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	// WebMvcConfigurerAdapter�N���X���p������ƁA �f�t�H���g�œK�p�����Bean��`���ȒP�ɃJ�X�^�}�C�Y�ł���

	// configureViewResolvers���\�b�h���I�[�o�[���C�h
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    	// /WEB-INF�f�B���N�g���z���Ɋi�[����Ă��� JSP�t�@�C����View�Ƃ��Ĉ��� ��܂�
        registry.jsp();
    }

}
