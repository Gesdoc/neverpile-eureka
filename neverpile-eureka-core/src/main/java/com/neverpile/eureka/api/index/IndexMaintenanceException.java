package com.neverpile.eureka.api.index;

import com.neverpile.eureka.api.NeverpileException;

public class IndexMaintenanceException extends NeverpileException {
  private static final long serialVersionUID = 1L;

  public IndexMaintenanceException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public IndexMaintenanceException(final String message) {
    super(message);
  }
}
