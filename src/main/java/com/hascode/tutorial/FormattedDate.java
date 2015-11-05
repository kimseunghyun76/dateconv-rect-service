package com.hascode.tutorial;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-03
 * Time : 오전 10:26
 * To change this template use File | Settings | File and Code Templates.
 */
public class FormattedDate {
    private final long id;
    private final String dateString;
    private final String pattern;

    public FormattedDate(final long id, final String pattern, final String dateString){
        this.id = id;
        this.pattern = pattern;
        this.dateString = dateString;
    }

    public long getId() {
        return id;
    }

    public String getDateString() {
        return dateString;
    }

    public String getPattern() {
        return pattern;
    }
}
