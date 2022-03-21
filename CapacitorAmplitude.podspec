require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name = "CapacitorAmplitude"
  s.version = package["version"]
  s.summary = package["description"]
  s.license = package["license"]
  s.homepage = package["repository"]["url"]
  s.author = package["author"]
  s.source = { :git => package["repository"]["url"], :tag => s.version.to_s }
  s.source_files = "ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}"
  s.platforms = { :ios => "11.0" }
  s.dependency "Capacitor"
  s.library = "sqlite3"
  s.dependency "Amplitude", "8.8.0"
  s.xcconfig = {
    "OTHER_LDFLAGS" => "-lsqlite3.0",
  }
end
