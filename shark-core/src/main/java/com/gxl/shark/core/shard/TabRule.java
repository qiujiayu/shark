/*
 * Copyright 2015-2101 gaoxianglong
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
package com.gxl.shark.core.shard;

import org.springframework.stereotype.Component;

import com.gxl.shark.exception.ShardException;

/**
 * 解析分表规则后计算分表索引
 * 
 * @author gaoxianglong
 */
@Component
public class TabRule extends RuleImpl {
	@Override
	public int getIndex(long routeValue, String ruleArray) {
		return getTabIndex(routeValue, ruleArray);
	}
}