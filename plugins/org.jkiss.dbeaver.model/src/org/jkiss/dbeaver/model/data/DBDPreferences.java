/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2017 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jkiss.dbeaver.model.data;

import org.jkiss.code.NotNull;

/**
 * Data preferences
 */
public interface DBDPreferences {

    /**
     * Gets current context's data formatter profile
     * @return profile
     */
    DBDDataFormatterProfile getDataFormatterProfile();

    /**
     * Sets current context's data formatter profile
     */
    void setDataFormatterProfile(DBDDataFormatterProfile formatterProfile);

    /**
     * Default value handler
     * @return value handler instance
     */
    @NotNull
    DBDValueHandler getDefaultValueHandler();

}
