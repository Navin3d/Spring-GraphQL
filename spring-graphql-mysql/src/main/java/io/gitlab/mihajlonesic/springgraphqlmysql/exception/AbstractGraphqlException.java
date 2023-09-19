package io.gitlab.mihajlonesic.springgraphqlmysql.exception;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public abstract class AbstractGraphqlException extends RuntimeException implements GraphQLError {

    private static final long serialVersionUID = -8623531655406639460L;
	private int errorCode;
    private String errorMessage;

    public AbstractGraphqlException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public Map<String, Object> getExtensions() {
        Map<String, Object> customAttributes = new LinkedHashMap<>();
        customAttributes.put("errorCode", this.errorCode);
        customAttributes.put("errorMessage", this.errorMessage);
        return customAttributes;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return null;
    }
}
