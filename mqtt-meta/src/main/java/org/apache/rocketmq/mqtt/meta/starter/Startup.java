 /*
  * Licensed to the Apache Software Foundation (ASF) under one or more
  * contributor license agreements.  See the NOTICE file distributed with
  * this work for additional information regarding copyright ownership.
  * The ASF licenses this file to You under the Apache License, Version 2.0
  * (the "License"); you may not use this file except in compliance with
  * the License.  You may obtain a copy of the License at
  *
  *     http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
package org.apache.rocketmq.mqtt.meta.starter;

import org.apache.rocketmq.client.log.ClientLogger;
import org.apache.rocketmq.mqtt.meta.util.SpringUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {
    public static void main(String[] args) {
        System.setProperty(ClientLogger.CLIENT_LOG_USESLF4J, "true");

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:meta_spring.xml");
        SpringUtil.setApplicationContext(applicationContext);
        System.out.println("start main ...");
    }
}