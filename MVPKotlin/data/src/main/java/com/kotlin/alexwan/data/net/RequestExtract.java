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

package com.kotlin.alexwan.data.net;

import android.support.annotation.NonNull;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by alexwan on 31/07/2017.
 */

public class RequestExtract {
    private static final ConcurrentHashMap<String, RequestService> services = new ConcurrentHashMap<>();

    private RequestExtract() {
    }

    public static RequestService SERVICE(@NonNull String baseUrl) {
        if (!services.containsKey(baseUrl) || services.get(baseUrl) == null) {
            // services.put(baseUrl, );
            return services.get(baseUrl);
        }
        return services.get(baseUrl);
    }


}
