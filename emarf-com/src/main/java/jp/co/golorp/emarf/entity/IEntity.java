/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package jp.co.golorp.emarf.entity;

import java.time.LocalDateTime;

/**
 * エンティティのマーカー
 *
 * @author golorp
 */
public interface IEntity {

    /**
     * @param now
     * @param execId
     * @return 追加件数
     */
    int insert(LocalDateTime now, String execId);

    /**
     * @param now
     * @param execId
     * @return 更新件数
     */
    int update(LocalDateTime now, String execId);

}
