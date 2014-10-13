package com.medicine.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Created by heren on 2014/10/13.
 */
public class MedContextListener extends GuiceServletContextListener {
    public MedContextListener() {
    }

    @Override
    protected Injector getInjector() {
        MedicineResourceModule module = new MedicineResourceModule();
        return Guice.createInjector(module);
    }
}
