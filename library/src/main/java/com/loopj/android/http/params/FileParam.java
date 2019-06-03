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
package com.loopj.android.http.params;

import java.io.File;

import cz.msebera.android.httpclient.entity.ContentType;

public class FileParam extends BaseParam<File> {

    private String customFileName;

    public FileParam(String name, File source) {
        super(name, source, ContentType.APPLICATION_OCTET_STREAM);
    }

    public FileParam(String name, File source, ContentType contentType) {
        super(name, source, contentType);
    }

    public FileParam(String name, File source, ContentType contentType, String fileName) {
        super(name, source, contentType);
        customFileName = fileName;
    }
}
