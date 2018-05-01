package com.hariofspades.dagger2advanced.module;

import android.content.Context;

import com.hariofspades.dagger2advanced.interfaces.ApplicationContext;
import com.hariofspades.dagger2advanced.interfaces.RandomUserApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Hari on 23/11/17.
 */
@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @ApplicationContext
    @RandomUserApplicationScope
    @Provides
    public Context context() {
        return context.getApplicationContext();
    }
}
