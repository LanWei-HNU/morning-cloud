package org.lanwei.morning.common;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.config.TableConfiguration;

/**
 * zidong 自动生成表别名，以便重用mapper文件
 * @author lanwei 2018-03-17
 */
public class MorningIntrospectedColumn extends IntrospectedColumn {
    private IntrospectedTable introspectedTable;

    @Override
    public String getTableAlias() {
        TableConfiguration tc = introspectedTable.getTableConfiguration();
        if (null != tc) {
            return getTableAlias(tc.getTableName());
        }

        return null;
    }

    @Override
    public IntrospectedTable getIntrospectedTable() {
        return introspectedTable;
    }

    @Override
    public void setIntrospectedTable(IntrospectedTable introspectedTable) {
        this.introspectedTable = introspectedTable;
        TableConfiguration tc = introspectedTable.getTableConfiguration();
        tc.setAlias(getTableAlias(tc.getTableName()));
        super.setIntrospectedTable(introspectedTable);
    }

    private String getTableAlias(String tableName) {
        String[] strArr = tableName.split("_");
        if (strArr.length == 1) {
            return strArr[0];
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < strArr.length - 1; i++) {
                stringBuilder.append(strArr[i].substring(0, 1));
            }
            stringBuilder.append(strArr[strArr.length - 1]);
            return stringBuilder.toString();
        }
    }
}
