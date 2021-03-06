/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gopivotal.cla.model;

import static org.junit.Assert.assertEquals;

import com.gopivotal.cla.testutil.ToStringTestUtils;

public final class LinkedRepositoryTest extends AbstractModelTest<LinkedRepository> {

    private static final Agreement AGREEMENT = new Agreement("test-agreement");

    @Override
    protected LinkedRepository getInstance() {
        return setId(new LinkedRepository(AGREEMENT, "B", "test-access-token"), Integer.MIN_VALUE + 2);
    }

    @Override
    protected void assertState(LinkedRepository instance) {
        assertEquals((Integer) (Integer.MIN_VALUE + 2), instance.getId());
        assertEquals(AGREEMENT, instance.getAgreement());
        assertEquals("B", instance.getName());
        assertEquals("test-access-token", instance.getAccessToken());
    }

    @Override
    protected void assertToString(ToStringTestUtils instance) {
        instance.assertToString("id", "agreement", "name", "accessToken");
    }
}
