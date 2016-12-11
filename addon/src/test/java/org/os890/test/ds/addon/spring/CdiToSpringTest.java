/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.os890.test.ds.addon.spring;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.os890.test.ds.addon.spring.bean.cdi.ApplicationScopedCdiBean;
import org.os890.test.ds.addon.spring.bean.spring.SingletonSpringBean;
import org.springframework.context.ApplicationContext;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("CdiInjectionPointsInspection")
@RunWith(CdiTestRunner.class)
public class CdiToSpringTest
{
    @Inject
    private ApplicationContext applicationContext;

    @Test
    public void springLookupTest()
    {
        assertThat(this.applicationContext.getBean(SingletonSpringBean.class)).isNotNull();
        assertThat(this.applicationContext.getBean(ApplicationScopedCdiBean.class)).isNotNull();
    }
}
