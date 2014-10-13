package com.medicine.module;

import com.google.inject.Singleton;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by heren on 2014/10/13.
 */
public class MedicineResourceModule extends JerseyServletModule {

    @Override
    protected void configureServlets() {
        bind(GuiceContainer.class);

        bind(MedCorsFilter.class).in(Singleton.class);
        filter("/api/*").through(MedCorsFilter.class);

        Map<String, String> params = new HashMap<String, String>();
//        params.put("jersey.config.server.provider.packages", "com.wiki.services");//Jersey 2.0
        params.put("com.sun.jersey.config.property.packages", "com.medicine.services"); //PROPERTY_PACKAGES
        params.put("com.sun.jersey.api.json.POJOMappingFeature", "true");

        serve("/api/*").with(GuiceContainer.class, params);
        install(new JpaPersistModule("domain"));
//        install(new JpaPersistModule("domain").properties(mySqlProperties()));
        filter("/api/*").through(PersistFilter.class);
    }

}
