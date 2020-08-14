public String getDynamicFileName(Container container) throws StreamTransformationException{
  String FileValue = "";
  try{
    //Get the DynamicConfiguration instance
    DynamicConfiguration config = (DynamicConfiguration) container.getTransformationParameters().get(StreamTransformationConstants.DYNAMIC_CONFIGURATION);
  
    //Define key to read from the Dynamic Configuration
    DynamicConfigurationKey key1 = DynamicConfigurationKey.create("http://sap.com/xi/XI/System/File", "FileName");
  
    //Read the FileName parameter from the Dynamic Configuration based on the key
    FileValue = config.get(key1);
  }catch(Exception ee){
    FileValue = "";
  }
  return FileValue;
}
