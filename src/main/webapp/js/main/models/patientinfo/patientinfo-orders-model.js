/**
 * Created by sf201 on 2014/11/29.
 */
var order = function(){
    //行号
    this.id = "";
    //长临标志
    this.repeatIndicator = "";
    //医嘱类别
    this.className = "";
    //医嘱下达日期
    this.startDateTime = "";
    //医嘱内容
    this.orderText = "";
    //剂量
    this.dosage = "";
    //单位
    this.dosageUnits = "";
    //途径
    this.administration = "";
    //频次
    this.frequency = "";
    //执行时间
    this.performSchedule = "";
    //停止时间
    this.stopDateTime = "";
    //医生说明
    this.freqDetail = "";
    //计价属性
    this.billingAttr = "";
    //摆药
    this.drugBillingAttr = "";
    //下达医生
    this.doctor = "";
    //停止医生
    this.stopDoctor = "";
    //护士
    this.nurse = "";
    //持续时间
    this.duration = "";
    //持续时间单位
    this.durationUnits = "";
    //转抄时间
    this.processingDateTime = "";

}