/**
 *    Copyright 2015 Austin Keener & Michael Ritter
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
package net.dv8tion.jda.events;

import net.dv8tion.jda.JDA;

public abstract class Event
{
    private final JDA api;
    private final int responseNumber;

    protected Event(JDA api, int responseNumber)
    {
        this.api = api;
        this.responseNumber = responseNumber;
    }

    /**
     * Returns the JDA instance corresponding to this Event
     *
     * @return The corresponding JDA instance
     */
    public JDA getJDA()
    {
        return api;
    }

    public int getResponseNumber()
    {
        return responseNumber;
    }
}
