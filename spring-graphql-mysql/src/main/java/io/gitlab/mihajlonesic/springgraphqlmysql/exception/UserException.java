package io.gitlab.mihajlonesic.springgraphqlmysql.exception;

public class UserException extends AbstractGraphqlException {
    private static final long serialVersionUID = -6131109801991859822L;

	public UserException(int errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}