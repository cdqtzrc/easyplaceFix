package org.uiop.easyplacefix.config;

import fi.dy.masa.malilib.config.IConfigBase;
import fi.dy.masa.malilib.config.options.ConfigBoolean;
public final class easyPlacefixConfig {
    public static final ConfigBoolean LOOSEN_MODE   = new ConfigBoolean("loosenMode", false, "EasyPlaceFix.config.generic.comment.loosenMode")
            .translatedName("EasyPlaceFix.config.generic.name.loosenMode");
    public static IConfigBase[] getExtraGenericConfigs() {
        return new IConfigBase[] {
                LOOSEN_MODE,
        };
    }
}
