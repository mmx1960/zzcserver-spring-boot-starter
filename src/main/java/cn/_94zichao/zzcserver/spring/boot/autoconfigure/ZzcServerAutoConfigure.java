package cn._94zichao.zzcserver.spring.boot.autoconfigure;

import cn._94zichao.server.bootstrap.ZzcServerBootstrap;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO ADD DESCRIPTION
 * Date: 2018/7/5
 * Time: 21:09
 *
 * @author zhangzch
 */
@Configuration
@ConditionalOnClass(ZzcServerBootstrap.class)
public class ZzcServerAutoConfigure {

    @Bean
    @ConditionalOnMissingBean(ZzcServerBootstrap.class)
    public ZzcServerBootstrap zzcServer() {
        return new ZzcServerBootstrapWrapper();
    }
}
