package br.df.lseabra.core;

import io.restassured.http.ContentType;

public interface Constantes {
	String APP_BASE_URL = "https://viacep.com.br/";
	Integer APP_PORT = 443;
	String APP_BASE_PATH = "ws";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	Long MAX_TIMEOUT = 10000L;

}