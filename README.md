# Capacitor amplitude plugin

Currently only works on ios, but android support will be coming soon

# Available methods:

- logEvent
- setUserProfileID
- reportUserProfile
- getDeviceID

# Usage example:

1. In your module (e.g. `app.module.ts`)

```ts
...
import { Amplitude } from 'capacitor-amplitude'

@NgModule({
	...
	providers: [
		...
		Amplitude,
	],
})
export class AppModule {}

```

2. In your component or service (e.g. `analytics.service.ts`)

```ts
...
import { Amplitude } from 'capacitor-amplitude'

@Injectable()
export class AnalyticsService {
	constructor(private amplitude: Amplitude) {}

	async init() {
		await this.amplitude.init('AMPLITUDE_API_KEY')
	}

	async logEvent(name: string, params?: Object) {
		await this.amplitude.logEvent(name, params)
	}

	async setUserId(id: string) {
		return this.amplitude.setUserId(id)
	}

	async getDeviceID(): string {
		return this.amplitude.getDeviceId()
	}

    async uploadEvents() {
        return this.amplitude.uploadEvents()
    }
}


```

## BREAKING CHANGES in 1.x.x version

- Added full support for Capacitor 3 and removed compatibility with Capacitor 2
