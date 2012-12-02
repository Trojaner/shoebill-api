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

package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.Textdraw;

/**
 * 
 * 
 * @author MK124
 */
public class PlayerClickTextDrawEvent extends PlayerEvent
{
	private int response = 0;
	private Textdraw textdraw;
	
	
	public PlayerClickTextDrawEvent(Player player, Textdraw textdraw)
	{
		super(player);
		this.textdraw = textdraw;
	}
	
	public void setResponse(int response)
	{
		this.response |= response;
	}
	
	public int getResponse()
	{
		return response;
	}
	
	public Textdraw getTextdraw()
	{
		return textdraw;
	}
}