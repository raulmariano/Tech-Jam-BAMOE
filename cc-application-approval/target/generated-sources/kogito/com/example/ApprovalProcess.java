package com.example;

import com.example.ApprovalModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("approval")
@io.quarkus.runtime.Startup()
public class ApprovalProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.ApprovalModel> {

    @jakarta.inject.Inject()
    public ApprovalProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public ApprovalProcess() {
    }

    @Override()
    public com.example.ApprovalProcessInstance createInstance(com.example.ApprovalModel value) {
        return new com.example.ApprovalProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.ApprovalProcessInstance createInstance(java.lang.String businessKey, com.example.ApprovalModel value) {
        return new com.example.ApprovalProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.ApprovalProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.ApprovalModel value) {
        return new com.example.ApprovalProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.ApprovalModel createModel() {
        return new com.example.ApprovalModel();
    }

    public com.example.ApprovalProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.ApprovalModel) value);
    }

    public com.example.ApprovalProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.ApprovalModel) value);
    }

    public com.example.ApprovalProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ApprovalProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.ApprovalProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ApprovalProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("approval", true);
        factory.variable("approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("customTags", "output", "approval", "approval", "ItemSubjectRef", "_approvalItem"));
        factory.variable("applicant", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Applicant.class), java.util.Map.of("customTags", "input", "ItemSubjectRef", "_applicantItem", "applicant", "applicant"));
        factory.variable("creditCard", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.CreditCard.class), java.util.Map.of("customTags", "output", "creditCard", "creditCard", "ItemSubjectRef", "_creditCardItem"));
        factory.name("approval");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_48806F31-5F4F-4914-89E8-14E620A3F7C7"));
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.name("Approved");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.terminate(false);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("UniqueId", "_48806F31-5F4F-4914-89E8-14E620A3F7C7");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("elementname", "Approved");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("x", 1048);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("width", 56);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("y", 221);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("height", 56);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"));
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.name("Generate CC Details");
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("UniqueId", "_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09");
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("elementname", "Generate CC Details");
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("NodeType", "ScriptTask");
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("x", 828);
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("width", 154);
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("y", 198);
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("height", 102);
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.action(kcontext -> {
            System.out.println("Credit card details generation task");
        });
        actionNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B44F71B-A355-43C5-83F2-0718EDE1811F"));
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.name("Credit Card Eligibility");
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("UniqueId", "_4B44F71B-A355-43C5-83F2-0718EDE1811F");
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("elementname", "Credit Card Eligibility");
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("NodeType", "ScriptTask");
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("x", 598);
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("width", 154);
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("y", 198);
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("height", 102);
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.action(kcontext -> {
            System.out.println("Credit card eligibility script task");
        });
        actionNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"));
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.name("Log application received");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("UniqueId", "_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("elementname", "Log application received");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("NodeType", "ScriptTask");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("x", 368);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("width", 154);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("y", 192);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("height", 102);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.action(kcontext -> {
            org.acme.cc_approval.model.Applicant applicant = (org.acme.cc_approval.model.Applicant) kcontext.getVariable("applicant");
            System.out.println("Process started for: " + applicant);
        });
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8"));
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.name("Start");
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.interrupting(false);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("UniqueId", "_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8");
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("EventType", "none");
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("x", 261);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("width", 56);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("y", 215);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("height", 56);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_48806F31-5F4F-4914-89E8-14E620A3F7C7"), "_B44ECAC8-5066-4417-97B0-ED30DC2033E1");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B44F71B-A355-43C5-83F2-0718EDE1811F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"), "_AA02755B-B5F4-4363-AC50-0D4F4128534C");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B44F71B-A355-43C5-83F2-0718EDE1811F"), "_8C6EB85E-8897-4A68-BC2F-70C95A3B03E7");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"), "_9B9122D7-42A7-47A9-9A86-A8347025F166");
        factory.validate();
        return factory.getProcess();
    }
}
