package com.javabaas.server.common.entity;

/**
 * 返回码
 * Created by Staryet on 15/8/24.
 */
public enum SimpleCode {
    SUCCESS(0, "成功"),
    NOT_FOUND(404, "无效地址"),
    INTERNAL_ERROR(500, "服务器内部错误"),
    INTERNAL_JSON_ERROR(501, "JSON处理失败"),
    REQUEST_PARAM_ERROR(2, "传入参数错误"),
    REQUEST_METHOD_ERROR(3, "请求方法错误"),
    REQUEST_JSON_ERROR(4, "JSON格式错误"),
    REQUEST_CONTENT_TYPE_ERROR(5, "需要 application/json 请求"),
    REQUEST_PLATFORM_ERROR(6, "请求头中JB-Plat信息错误"),
    AUTH_LESS(10, "缺少授权信息"),
    AUTH_TIME_OUT(11, "授权信息失效"),
    AUTH_ERROR(12, "授权信息验证失败"),
    AUTH_NEED_ADMIN_AUTH(13, "缺少超级权限"),
    AUTH_NEED_MASTER_AUTH(14, "缺少管理权限"),
    AUTH_REPLAY_ATTACK(15, "拒绝重放攻击"),
    AUTH_APP_ID_LESS(16, "缺少JB-AppId"),
    //1xx 管理端相关
    CONSOLE_USER_ERROR(101, "用户名密码错误"),
    CONSOLE_NOT_LOGIN(102, "未登录"),
    CONSOLE_SESSION_TOKEN_ERROR(103, "SessionToken无效"),
    //10xx 应用相关
    APP_NOT_FOUND(1001, "应用不存在"),
    APP_ALREADY_EXIST(1002, "应用名已存在"),
    APP_NAME_ERROR(1003, "应用名称错误"),
    APP_ACCOUNT_ERROR(1004, "应用账号配置错误"),
    APP_WEBAPP_ACCOUNT_ERROR(1005, "应用小程序账号配置错误"),
    APP_PUSH_ACCOUNT_ERROR(1006, "应用推送账号配置错误"),
    APP_CONFIG_KEY_NOT_EXIST(1007, "应用Config Key不存在"),
    //11xx 类相关
    CLAZZ_NOT_FOUND(1101, "类不存在"),
    CLAZZ_ALREADY_EXIST(1102, "类已经存在"),
    CLAZZ_NAME_ERROR(1103, "类名称错误"),
    CLAZZ_INTERNAL(1104, "内建类禁止删除"),
    //12xx 字段相关
    FIELD_NOT_FOUND(1201, "字段不存在"),
    FIELD_ALREADY_EXIST(1202, "字段已存在"),
    FIELD_NAME_MISSING(1203, "字段名缺失"),
    FIELD_NAME_ERROR(1204, "字段名禁止使用"),
    FIELD_INTERNAL(1205, "内建字段禁止删除"),
    FIELD_TYPE_ERROR(1206, "字段类型错误"),
    //13xx 用户相关
    USER_NOT_EXIST(1301, "用户不存在"),
    USER_EMPTY_PASSWORD(1302, "密码不能为空"),
    USER_EMPTY_USERNAME(1303, "用户名不能为空"),
    USER_WRONG_PASSWORD(1304, "密码错误"),
    USER_ALREADY_EXIST(1305, "用户名已存在"),
    USER_NOT_MATCH(1306, "用户不匹配禁止修改信息"),
    USER_AUTH_REJECT(1307, "第三方登录授权信息无效"),
    USER_AUTH_ERROR(1308, "第三方登录授权信息不足"),
    USER_AUTH_EXIST(1309, "第三方用户帐号已经被其他用户绑定 禁止重复绑定"),
    USER_SESSION_TOKEN_ERROR(1310, "SessionToken已失效"),
    USER_INVALID_USERNAME(1311, "用户名非法 用户名只能包含数字字母 _ @ ."),
    USER_AUTH_PLATFORM_MISSING(1312, "第三方登录平台错误"),
    USER_PHONE_BIND_ALREADY_EXIST(1321, "手机号已经被绑定"),
    USER_PHONE_BIND_ALREADY_BIND(1322, "已绑定手机号 需解除后重新绑定"),
    //14XX 角色相关
    ROLE_NOT_EXIST(1401, "角色不存在"),
    ROLE_EMPTY_NAME(1402, "角色名不能为空"),
    ROLE_EMPTY_ACL(1403, "角色acl不能为空"),
    ROLE_ALREADY_EXIST(1404, "角色已存在"),
    ROLE_NAME_CANNOT_MODIFY(1405, "角色名不允许修改"),
    ROLE_INVALID_NAME(1406, "角色名只能包含数字、字母和下划线"),
    //2XXX 对象存储相关
    OBJECT_FIELD_TYPE_ERROR(2001, "字段类型错误"),
    OBJECT_FIELD_NOTNULL(2002, "字段不能为空"),
    OBJECT_INCLUDE_ERROR(2003, "包含字段格式错误"),
    OBJECT_QUERY_ERROR(2004, "查询条件格式错误"),
    OBJECT_ID_ERROR(2005, "id格式错误"),
    OBJECT_NOT_EXIST(2006, "对象不存在"),
    OBJECT_NO_ACCESS(2007, "无操作权限"),
    OBJECT_CLAZZ_NO_ACCESS(2008, "无表级权限"),
    OBJECT_FILE_NOT_FOUND(2009, "文件不存在 请检查文件id"),
    OBJECT_DUPLICATE_KEY(2010, "唯一索引值重复"),
    OBJECT_SUB_QUERY_EMPTY_WHERE(2011, "子查询缺少where字段或where字段不是map"),
    OBJECT_SUB_QUERY_EMPTY_SEARCH_CLASS(2012, "子查询缺少searchClass字段"),
    OBJECT_FIND_AND_MODIFY_FAILED(2013, "更新失败 条件不满足"),
    OBJECT_OPERATOR_NOT_EXIST(2014, "对象操作符不存在"),
    OBJECT_OPERATOR_WRONG_TYPE(2015, "对象操作符类型错误"),
    OBJECT_OPERATOR_WRONG_VALUE(2016, "对象操作符取值错误"),
    OBJECT_SUB_QUERY_WRONG_SORT(2017, "子查询sort字段不是map"),
    OBJECT_INSERT_ERROR(2018,"插入对象出错"),
    //3XXX 文件存储相关
    FILE_NO_HANDLER(3001, "无对应的物理文件处理器"),
    FILE_CALLBACK_NO_VALID(3002, "回调授权失败"),
    FILE_FETCH_FAILED(3003, "文件抓取失败"),
    FILE_NOT_EXIST(3004, "文件不存在"),
    FILE_PROCESS_FAILED(3005, "文件持久化处理失败"),
    FILE_PLATFORM_ERROR(3006, "错误的文件存储平台"),
    FILE_PLATFORM_EMPTY(3007, "未指定文件存储平台"),
    FILE_NO_AK(3008, "未设置文件存储AK"),
    FILE_NO_SK(3009, "未设置文件存储SK"),
    FILE_NO_BUCKET(3010, "未设置文件存储Bucket"),
    FILE_NO_URL(3011, "文件存储未设置url"),
    //4xxx 云代码相关
    CLOUD_NOT_DEPLOYED(4001, "云代码未部署"),
    CLOUD_FUNCTION_NOT_FOUND(4002, "云方法未配置"),
    CLOUD_FUNCTION_EXECUTE_FAILED(4003, "云方法执行失败"),
    //5xxx 钩子相关
    HOOK_INTERCEPTION(5001, "钩子中断"),
    //6xxx 推送相关
    PUSH_ERROR(6001, "推送失败"),
    PUSH_NO_AK(6002, "未设置推送AK"),
    PUSH_NO_SK(6003, "未设置推送SK"),
    PUSH_EMPTY(6004, "推送信息不能为空"),
    //7xxx 短信相关
    SMS_RATE_LIMIT(7001, "短信发送频率超过限制"),
    SMS_SEND_INTERVAL_LIMIT(7002, "禁止连续发送"),
    SMS_HANDLER_NOT_DEFINE(7003, "短信处理器未定义"),
    SMS_HANDLER_NOT_FOUND(7004, "短信处理器未找到"),
    SMS_NO_KEY(7005, "短信发送未设置key"),
    SMS_NO_SECRET(7006, "短信发送未设置Secret"),
    SMS_NO_SIGN_NAME(7007, "短信发送必须配置签名"),
    SMS_SEND_ERROR(7008, "短信发送失败"),
    SMS_CODE_TEMPLATE(7009, "短信验证码对应模版未设置"),
    SMS_ILLEGAL_PHONE_NUMBER(7011, "手机号不合法"),
    SMS_AMOUNT_NOT_ENOUGH(7012, "余额不足"),
    SMS_INVALID_PARAM(7013, "短信传入参数不合法"),
    SMS_TEMPLATE_MISSING_PARAMETERS(7014, "模版缺少变量"),
    SMS_LIMIT_CONTROL(7015, "超出短信供应商发送频率限制"),
    SMS_CODE_WRONG(7016, "短信验证码错误"),
    SMS_WRONG_TRY_LIMIT(7017, "短信验证码输入错误次数超过限制"),
    SMS_OTHER_ERRORS(7099, "其他错误 请查看日志");

    private int code;
    private String message;

    SimpleCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
