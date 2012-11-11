/**
 * Copyright (C) 2012 MK124
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

package net.gtaun.shoebill.events;

import net.gtaun.shoebill.events.service.ServiceRegisterEvent;
import net.gtaun.shoebill.events.service.ServiceReregisterEvent;
import net.gtaun.shoebill.events.service.ServiceUnregisterEvent;
import net.gtaun.util.event.AbstractEventHandler;

/**
 * 
 * 
 * @author MK124
 */
public class ServiceEventHandler extends AbstractEventHandler
{	
	public ServiceEventHandler()
	{
		super(ServiceEventHandler.class);
	}
	
	public void onServiceRegister(ServiceRegisterEvent event)			{ }
	public void onServiceReregister(ServiceReregisterEvent event)		{ }
	public void onServiceRegister(ServiceUnregisterEvent event)			{ }
}