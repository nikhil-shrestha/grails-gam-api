package gam.api.utils

class HelperUtils {

  static def parseDouble(String value){
    if (!(value)){
      return 0.0
    }

    return Double.parseDouble(value)
  }


}
