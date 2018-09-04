/*
 * ACES Listener API
 *
 * API Specification for ACES Listeners that read data on a blockchain and forward transaction events to registered subscribers. 
 *
 * API version: 1.1.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package arkaces/aces-listener-api

import (
	"time"
)

type SubscriptionResubscribe struct {
	// Date the Resubscription was created.
	CreatedAt time.Time `json:"createdAt,omitempty"`
}