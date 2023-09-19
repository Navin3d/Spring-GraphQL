package io.gitlab.mihajlonesic.springgraphqlmysql.exception;

public class ProjectException extends AbstractGraphqlException {
    private static final long serialVersionUID = 7836752512974997766L;

	public ProjectException(int errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}