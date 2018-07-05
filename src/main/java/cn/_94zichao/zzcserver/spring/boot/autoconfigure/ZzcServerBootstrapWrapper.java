package cn._94zichao.zzcserver.spring.boot.autoconfigure;

import cn._94zichao.server.bootstrap.ZzcServerBootstrap;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * TODO ADD DESCRIPTION
 * Date: 2018/7/5
 * Time: 21:10
 *
 * @author zhangzch
 */
@ConfigurationProperties("zzc.server")
public class ZzcServerBootstrapWrapper extends ZzcServerBootstrap {

}
