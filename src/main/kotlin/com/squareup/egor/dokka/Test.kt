package com.squareup.egor.dokka

class Test {
  /**
   * @throws ACustomExceptionClassWithAVeryLongName - always
   */
  fun test(): Nothing = throw ACustomExceptionClassWithAVeryLongName()
}
