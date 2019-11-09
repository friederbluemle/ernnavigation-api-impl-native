package com.walmartlabs.moviesreloaded;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.ern.api.impl.core.LaunchConfig;
import com.ern.api.impl.navigation.ElectrodeBaseActivity;
import com.ern.api.impl.navigation.MiniAppNavigationFragment;
import com.ern.api.impl.navigation.Route;

public class DefaultActivity extends ElectrodeBaseActivity {
    @NonNull
    @Override
    public String getRootComponentName() {
        return "MoviesReloaded";
    }

    @Override
    protected int mainLayout() {
        return R.layout.activity_default;
    }

    @Override
    public int getFragmentContainerId() {
        return R.id.fragment_container;
    }

    @NonNull
    @Override
    protected Class<? extends Fragment> miniAppFragmentClass() {
        return MiniAppNavigationFragment.class;
    }

    @Override
    public boolean navigate(Route route) {
        if (route == null) {
            //Start a new activity
            return true;
        }
        return super.navigate(route);
    }

    @Override
    protected LaunchConfig createDefaultLaunchConfig() {
        LaunchConfig config = super.createDefaultLaunchConfig();
        config.setForceUpEnabled(true);
        return config;
    }
}
