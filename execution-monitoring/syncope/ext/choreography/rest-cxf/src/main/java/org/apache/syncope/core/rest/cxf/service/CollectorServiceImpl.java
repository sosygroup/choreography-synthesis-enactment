/*
 * Copyright 2015 The CHOReVOLUTION project
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
package org.apache.syncope.core.rest.cxf.service;

import eu.chorevolution.idm.common.to.ChoreographyInstanceTO;
import eu.chorevolution.idm.common.to.EventDataTO;
import java.util.List;
import org.apache.syncope.common.rest.api.service.CollectorService;
import org.apache.syncope.core.logic.CollectorLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectorServiceImpl extends AbstractServiceImpl implements CollectorService {

    @Autowired
    private CollectorLogic logic;

    @Override
    public void logEvent(final EventDataTO eventData) {
        logic.saveLogEvent(eventData);
    }

    @Override
    public void addInstance(final ChoreographyInstanceTO choreographyInstanceTO) {
        logic.addInstance(choreographyInstanceTO);
    }

    @Override
    public void eventList(List<EventDataTO> eventList) {
        logic.saveEventList(eventList);
    }   
}
