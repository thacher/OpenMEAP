package com.openmeap.util;

import java.io.InputStream;

public interface HttpResponse {
	int getStatusCode();
	InputStream getResponseBody();
}
