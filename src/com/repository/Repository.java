package com.repository;

import java.sql.Connection;

public interface Repository {
    String tableName = "";
    Connection connection = null;
}
