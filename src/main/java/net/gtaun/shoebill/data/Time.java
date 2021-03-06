/**
 * Copyright (C) 2011-2014 MK124
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

package net.gtaun.shoebill.data;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author MK124
 */
public class Time implements Cloneable, Serializable
{
	private static final long serialVersionUID = -2904498722367946789L;
	
	
	public int hour, minute;
	
	
	public Time()
	{
		
	}
	
	public Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	public Time(Time time)
	{
		this.hour = time.getHour();
		this.minute = time.getMinute();
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setMinute(int minute)
	{
		this.minute = minute;
	}
	
	public void set(int hour, int minute)
	{
		setHour(hour);
		setMinute(minute);
	}
	
	public void set(Time time)
	{
		setHour(time.getHour());
		setMinute(time.getMinute());
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(67867979, 573259391, this, false);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Time clone()
	{
		try
		{
			return (Time) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new InternalError();
		}
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}
