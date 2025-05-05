/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.example;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "approval", name = "Approval", hidden = true)
public class ApprovalModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<ApprovalModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "approval")
    @jakarta.validation.Valid()
    private java.lang.String approval;

    public java.lang.String getApproval() {
        return approval;
    }

    public void setApproval(java.lang.String approval) {
        this.approval = approval;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "creditCard")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.CreditCard creditCard;

    public org.acme.cc_approval.model.CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(org.acme.cc_approval.model.CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override()
    public ApprovalModel toModel() {
        ApprovalModel result = new ApprovalModel();
        result.setId(getId());
        result.setApproval(getApproval());
        result.setCreditCard(getCreditCard());
        return result;
    }
}
