/*
    Copyright (c) 2015 Marek Sebera <marek.sebera@gmail.com>

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package com.loopj.android.http;

import android.content.Context;

import com.loopj.android.http.interfaces.RequestInterface;
import com.loopj.android.http.requests.GetRequest;
import com.loopj.android.http.requests.PostRequest;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpEntity;

public final class RequestFactory {

    public static RequestInterface get(Context context, String URL, Header[] headers) {
        return new GetRequest(false, context, URL, headers, null);
    }

    public static RequestInterface post(Context context, String URL, Header[] headers, HttpEntity postEntity) {
        return new PostRequest(false, context, URL, headers, postEntity, null);
    }

}
