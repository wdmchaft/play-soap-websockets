/*
 * Copyright 2011 Christophe Hamerling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

/**
 * @author chamerling
 * 
 */
public class Topic {

	/**
	 * TOpic name
	 */
	String name;

	/**
	 * Last message received for this topic
	 */
	String lastReceived;

	/**
	 * Total nb of received messages for the current topic
	 */
	long nb;

}
