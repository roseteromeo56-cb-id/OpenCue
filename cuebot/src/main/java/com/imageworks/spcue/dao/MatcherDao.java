
/*
 * Copyright Contributors to the OpenCue Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.imageworks.spcue.dao;

import java.util.List;

import com.imageworks.spcue.FilterInterface;
import com.imageworks.spcue.MatcherEntity;
import com.imageworks.spcue.MatcherInterface;

public interface MatcherDao {

    void insertMatcher(MatcherEntity matcher);

    void deleteMatcher(MatcherInterface matcher);

    void updateMatcher(MatcherEntity matcher);

    MatcherEntity getMatcher(String id);

    MatcherEntity getMatcher(MatcherInterface matcher);

    List<MatcherEntity> getMatchers(FilterInterface filter);

}
