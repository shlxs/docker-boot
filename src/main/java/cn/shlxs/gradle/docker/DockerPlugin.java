package cn.shlxs.gradle.docker;

import com.palantir.gradle.docker.PalantirDockerPlugin;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.model.ObjectFactory;

/**
 * @author shaohongliang
 * @since 2020/7/8 15:40
 */
public class DockerPlugin extends PalantirDockerPlugin {

    public DockerPlugin(ObjectFactory objectFactory, ImmutableAttributesFactory attributesFactory) {
        super(objectFactory, attributesFactory);
    }
}
