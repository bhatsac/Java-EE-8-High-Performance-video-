/*
 * Copyright (c) 2014-2018 Gregor Roth and others
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.packtpub.performance.rest.stability.utils.jaxrs.container;

public interface Environment  {

    Threadpool getThreadpoolUsage();       

    public static class Threadpool {
        private final String name;
        private final int maxThreads;
        private final int currentThreadCount;
        private final int currentThreadsBusy;
        
        public Threadpool(String name, int maxThreads, int currentThreadCount, int currentThreadsBusy) {
            this.name = name;
            this.maxThreads = maxThreads;
            this.currentThreadCount = currentThreadCount;
            this.currentThreadsBusy = currentThreadsBusy;
        }
        
        public String getName() {
            return name;
        }
        
        public int getMaxThreads() {
            return maxThreads;
        }
        
        public int getCurrentThreadCount() {
            return currentThreadCount;
        }
        
        public int getCurrentThreadsBusy() {
            return currentThreadsBusy;
        }       
    }
}