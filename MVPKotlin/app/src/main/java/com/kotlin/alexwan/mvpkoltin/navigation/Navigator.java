/*
 * Copyright (C) 2015 Alex Open Source Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.kotlin.alexwan.mvpkoltin.navigation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.kotlin.alexwan.mvpkoltin.view.activity.UserDetailActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by alexwan on 31/07/2017.
 */
@Singleton
public class Navigator {

    @Inject
    public Navigator() {
    }

    public void navigateToUserList(@NonNull Context context) {
        //  Intent intentToLaunch = UserListActivity

    }

    public void navigateToUserDetail(@NonNull Context context, int userId) {
        Intent intent = new Intent(context, UserDetailActivity.class);
        context.startActivity(intent);
    }
}
