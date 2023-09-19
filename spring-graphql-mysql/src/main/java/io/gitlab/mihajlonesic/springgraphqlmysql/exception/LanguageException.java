package io.gitlab.mihajlonesic.springgraphqlmysql.exception;

public class LanguageException extends AbstractGraphqlException {
    private static final long serialVersionUID = -8945761047355887461L;

	public LanguageException(int errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}