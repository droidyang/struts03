/*
 * Copyright 2006 The Apache Software Foundation.
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
package com.droid.web.start.strutsapp.struts02.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;


@Result(name="success",location="jsp/index.jsp")
public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = 7630529800199709824L;
	private Date now = new Date(System.currentTimeMillis());
    
    @TypeConversion(converter = "com.droid.web.start.strutsapp.struts02.DateConverter")
    public Date getDateNow() { return now; }
    
    @Actions({
        @Action("/index")
      })
    public String execute() throws Exception {
        now = new Date(System.currentTimeMillis());
        return SUCCESS;
    }
}
