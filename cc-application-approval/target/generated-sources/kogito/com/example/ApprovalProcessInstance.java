package com.example;

import com.example.ApprovalModel;

public class ApprovalProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ApprovalModel> {

    public ApprovalProcessInstance(com.example.ApprovalProcess process, ApprovalModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ApprovalProcessInstance(com.example.ApprovalProcess process, ApprovalModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ApprovalProcessInstance(com.example.ApprovalProcess process, ApprovalModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ApprovalProcessInstance(com.example.ApprovalProcess process, ApprovalModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public ApprovalProcessInstance(com.example.ApprovalProcess process, ApprovalModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(ApprovalModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(ApprovalModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
