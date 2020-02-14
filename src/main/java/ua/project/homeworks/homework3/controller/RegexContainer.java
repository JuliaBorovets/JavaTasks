package ua.project.homeworks.homework3.controller;

import javax.print.DocFlavor;

public interface RegexContainer {

    String REGEX_NAME_UKR = "^[А-ЩЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";

    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

    String PATRONYMIC = "^[А-ЩЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String PHONE_HOME = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";

    String PHONE_MOBILE = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";

    String EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";

    String SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,30}$";

    String ADDRESS_INDEX = "^[\\d]{5}$";

    String ADDRESS_CITY = "^[A-Z]{1}[a-zA-Z]{2,15}$";

    String ADDRESS_STREET = "^[A-Z]{1}[a-z]{1,20}$";

}