/*
 * Copyright (C) 2019 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package com.authlete.jaxrs.server.ad.type;


/**
 * Result of end-user authentication and authorization returned from
 * <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
 *
 * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device
 *      simulator</a>
 *
 * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim">Authlete
 *      CIBA authentication device simulator API</a>
 *
 * @author Hideki Ikeda
 */
public enum Result
{
    /**
     * The result showing that an end-user authorized a client application's request.
     */
    allow,


    /**
     * The result showing that an end-user denied a client application's request.
     */
    deny,


    /**
     * The result showing that timeout occurred during end-user authentication and
     * authorization process.
     */
    timeout
    ;
}
