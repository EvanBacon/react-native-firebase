package io.invertase.firebase.functions;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("unused")
public class RNFirebaseFunctionsPackage implements ReactPackage {
  public RNFirebaseFunctionsPackage() {
  }

  /**
   * @param reactContext react application context that can be used to create modules
   * @return list of native modules to register with the newly created catalyst instance
   */
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    modules.add(new RNFirebaseFunctions(reactContext));
    return modules;
  }

  /**
   * @param reactContext
   * @return a list of view managers that should be registered with {@link UIManagerModule}
   */
  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
