package com.engineerkunle.demofootballapp.injection.components;

import com.engineerkunle.demofootballapp.injection.modules.FragmentModule;
import com.engineerkunle.demofootballapp.injection.scopes.FragmentScope;
import com.engineerkunle.demofootballapp.ui.main.TeamStatsFragment;

import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
    void inject(TeamStatsFragment teamStatsFragment);
}
